package history.com.rxjava;

/**
 * 1.version:
 * 2.date:2016/12/29 11:22
 * 3.update:2016/12/29.
 * 4.autour:张玉杰
 */
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("状态为："+observerState);
    }

}
