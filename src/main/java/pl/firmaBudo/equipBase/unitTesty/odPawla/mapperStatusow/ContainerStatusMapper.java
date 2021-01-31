package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperStatusow;

import java.util.Arrays;
import java.util.List;

public class ContainerStatusMapper {

    private final static List<InternalContainerStatus> AVAILABLE_FOR_RENT = Arrays.asList(InternalContainerStatus.READY_TO_USE, InternalContainerStatus.TRANSPORT_TO_BASE);
    private final static List<InternalContainerStatus> NOT_AVAILABLE_FOR_RENT = Arrays.asList(InternalContainerStatus.RENT, InternalContainerStatus.TRANSPORT_TO_CLIENT);
    private final static List<InternalContainerStatus> OUT_OF_USE = Arrays.asList(InternalContainerStatus.IN_REPAIR, InternalContainerStatus.DAMAGE, InternalContainerStatus.ON_SERVICE);

    public ContainerRentStatus toContainerStatus(InternalContainerStatus internalContainerStatus) {
        if (AVAILABLE_FOR_RENT.contains(internalContainerStatus)) {
            return ContainerRentStatus.AVAILABLE;
        }
        if (NOT_AVAILABLE_FOR_RENT.contains(internalContainerStatus)) {
            return ContainerRentStatus.NOT_AVAILABLE;
        }
        if(OUT_OF_USE.contains(internalContainerStatus)) {
            return ContainerRentStatus.TEMPORARY_DECOMMISSION;
        }
        return ContainerRentStatus.UNKNOWN;
    }
}
