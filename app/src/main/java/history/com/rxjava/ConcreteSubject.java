package history.com.rxjava;

/**
 * 1.version:
 * 2.date:2016/12/29 11:21
 * 3.update:2016/12/29.
 * 4.autour:张玉杰
 */
public class ConcreteSubject extends Subject{

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState){
        state = newState;
        System.out.println("主题状态为：" + state);
        //状态发生改变，通知各个观察者
        this.nodifyObservers(state);
    }
}