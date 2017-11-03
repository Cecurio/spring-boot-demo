package cn.cecurio.conditional;

/**
 * @author: Cecurio
 * @create: 2017-10-31 18:52
 * @desc:
 **/
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
