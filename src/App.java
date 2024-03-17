import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class App {
    public static void main(String[] args) throws Exception {
        
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        
        String os = osBean.getName();
        String version = osBean.getVersion();
        String architecture = osBean.getArch();
        int availableProcessors = osBean.getAvailableProcessors();

        System.out.println(os);
        System.out.println(version);
        System.out.println(architecture);
        System.out.println(availableProcessors);
    }
}
