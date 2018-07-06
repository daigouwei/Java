import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.*;

public class GetPicture{
    public static void main(String[] args){
        System.out.println("start...");
        try{
            GetPicture gp = new GetPicture();
            ArrayList<ArrayList<String>> imageList = gp.getImage();
            for(int i = 0; i < imageList.get(0).size(); i++){
                gp.download(imageList.get(0).get(i), imageList.get(1).get(i), imageList.get(2).get(i));
            }
        }catch(Exception e){
            System.out.println("出现错误");
            e.printStackTrace();
        }
    }

    //用来读取文件获得url，分类（目录路径），图片名
    private ArrayList<ArrayList<String>> getImage(){
        ArrayList<ArrayList<String>> imageList = new ArrayList<ArrayList<String>>();

        ArrayList<String> url = new ArrayList<String>();
        url.add("http://ww4.sinaimg.cn/mw1024/005vbOHfgw1eylg2gnnrlj30ia0s87ac.jpg");
        url.add("http://qiniu.cuiqingcai.com/wp-content/uploads/2017/04/横图：崔庆才-自己动手，丰衣足食！Python3网络爬虫实战案例.png");
        url.add("https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1511807775152&amp;di=65bd96d30c5ed123c636183eebb205a1&amp;imgtype=0&amp;src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20171031%2F13627b92a724481d83f1938e3c3fe765.jpeg");
        url.add("http://img02.tooopen.com/images/20160122/tooopen_sy_155242698349.jpg");

        ArrayList<String> path = new ArrayList<String>();
        path.add("./mulu/");
        path.add("./");
        path.add("./");
        path.add("./mulu/mu/");

        ArrayList<String> name = new ArrayList<String>();
        name.add("haha.jpg");
        name.add("xixi.jpg");
        name.add("hehe.jpg");
        name.add("heihei.jpg");

        imageList.add(url);
        imageList.add(path);
        imageList.add(name);
        return imageList;
    }
/*
    private void download(ArrayList<String> imgSrc){
        try{
            for(String imgUrl: imgSrc){
                System.out.println(imgUrl);
                String imageName = imgUrl;
                URL url = new URL(imgUrl);
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; rv:11.0) like Gecko");
                conn.connect();
                InputStream inStream = conn.getInputStream();
                ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                int len = 0;
                System.out.println("开始下载："+imgUrl);
                while((len = inStream.read(buf)) != -1){
                    outStream.write(buf, 0, len);
                }
                inStream.close();
                outStream.close();
                File file = new File(("./")+imageName);
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(outStream.toByteArray());
                fos.close();
                System.out.println(imageName+"下载完成");
            }
        }catch(Exception e){
            System.out.println("下载失败");
            e.printStackTrace();
        }
    }
*/
    private void download(String url,String path, String name){
        File file= null;
        File dirFile=null;
        FileOutputStream fos=null;
        HttpURLConnection httpCon = null;
        URLConnection  con = null;
        URL urlObj=null;
        InputStream in =null;
        byte[] size = new byte[1024];
        int num=0;
        try {
            dirFile = new File(path);
            if(!dirFile.exists()){
                if(dirFile.mkdir()){
                    if(path.length()>0){
                        //sop("creat document file \""+path.substring(0,path.length()-1)+"\" success...\n");
                    }
                }
            }
            //}else{
            file = new File(path+name);
            System.out.println("开始下载"+file);
            fos = new FileOutputStream(file);
            if(url.startsWith("http")){
                urlObj = new URL(url);
                con = urlObj.openConnection();
                httpCon =(HttpURLConnection) con;
                in = httpCon.getInputStream();
                while((num=in.read(size)) != -1){
                    for(int i=0;i<num;i++)
                       fos.write(size[i]);
                }
            }
            System.out.println("完成下载"+file);
            //}
        } catch (Exception e) {
            System.out.println("下载失败"+file);
            e.printStackTrace();
        } finally{
            try {
                fos.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
