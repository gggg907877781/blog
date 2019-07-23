package cn.kingzao.blog;

public class StaticDemoTest {

    private final ThreadLocal perThreadInstance = new ThreadLocal();
    private Helper helper = null;

    public Helper getHelper(){
        if(perThreadInstance.get()== null)createHelper();
        return helper;
    }

    private final void createHelper(){
        synchronized(this){
            if(helper == null)
            helper = new Helper();
        }
        perThreadInstance.set(perThreadInstance);
    }


}
