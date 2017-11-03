package cn.cecurio.conditional;

/**
 * @author: Cecurio
 * @create: 2017-10-31 18:53
 * @desc:
 **/
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
