/**
 *单例模式
 *确保一个类只有一个实例，并提供一个全局访问点。
 */

public class Single
{
	private Single(){}
	private static Single single = new Single();
	public static Single getInstance()
	{
		return single;
	}
}

public class Single
{
	private static Single single = null;
	private Single(){}
	public static Single getInstance()
	{
		if(single == null)
			single = new Single();
		return single;
	}
}

public class Single
{
	private static Single single = null;
	private Single(){}
	public static Single getInstance()
	{
		if(single == null)
		{
			synchronized(Single.class)
			{
				if(single == null)
					single = new Single();
			}
		}
		return single;
	}
}
