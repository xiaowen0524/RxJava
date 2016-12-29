package history.com.rxjava;

/**
 * 1.version:
 * 2.date:2016/12/29 11:22
 * 3.update:2016/12/29.
 * 4.autour:张玉杰
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
