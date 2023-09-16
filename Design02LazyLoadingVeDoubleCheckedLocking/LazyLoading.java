package Design02LazyLoadingVeDoubleCheckedLocking;

public class LazyLoading {
    private static LazyLoading lazyLoading;
    private static LazyLoading lazyLoading1;
    public LazyLoading(){
        System.out.println("lazyLoading Nesnesi oluştu");
    }
    public static LazyLoading getLazyLoading(){
        lazyLoading = new LazyLoading();
        return lazyLoading;
    }
    public static LazyLoading getLazyLoading1(){
        if(lazyLoading==null) {
            lazyLoading = new LazyLoading();
        }
        return lazyLoading;
    }

    public static LazyLoading getLazyLoadingSync(){
        if(lazyLoading1==null){
            synchronized (LazyLoading.class){
                if(lazyLoading1==null) {
                    lazyLoading1 = new LazyLoading();
                }
            }
        }
        //lazy loadin ve Doubele Checked yaptık
        return lazyLoading1;
    }

}
