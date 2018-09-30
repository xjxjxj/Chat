package hello.leavesC.presenter.event;

/**
 * 作者：叶应是叶
 * 时间：2018/9/29 22:39
 * 描述：
 */
public class RegisterEvent extends BaseEvent {

    public static final int REG_SUCCESS = 10;

    private String identifier;

    public RegisterEvent(int action) {
        super(action);
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}