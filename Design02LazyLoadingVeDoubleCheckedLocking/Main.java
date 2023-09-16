package Design02LazyLoadingVeDoubleCheckedLocking;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            LazyLoading.getLazyLoading1();
            //Nesne null kontrolü ile  1 defa olusturuldu
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            LazyLoading.getLazyLoading();
            //nesnenin her seferinde eniden olusturduk
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            LazyLoading.getLazyLoadingSync();
            //nesnenin her seferinde olsuturduk ve sync ile nesneleri hızlı bir bicimde olsuturduk
        }
    }
}
