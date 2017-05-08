package net.came20.pitcommander.module.stacklight.listener;

import net.came20.pitcommander.module.stacklight.Stacklight;
import net.came20.pitcommander.moduleframework.announce.AnnounceTask;
import net.came20.pitcommander.moduleframework.announce.Announcement;

/**
 * Created by cameronearle on 5/7/17.
 */
public class ChecklistContainerUpdateTask implements AnnounceTask {
    @Override
    public void onAnnounce(Announcement announcement) {
        boolean allChecked = ((boolean) announcement.getPayload().get("allChecked"));
        boolean redTask = ((boolean) announcement.getPayload().get("redSwitchTask"));
        boolean blueTask = ((boolean) announcement.getPayload().get("blueSwitchTask"));
        if (allChecked) {
            Stacklight.getInstance().SL_greenOn();
        } else {
            Stacklight.getInstance().SL_greenOff();
        }

        if (redTask) {
            Stacklight.getInstance().SL_redOn();
        } else {
            Stacklight.getInstance().SL_redOff();
        }

        if (blueTask) {
            Stacklight.getInstance().SL_blueOn();
        } else {
            Stacklight.getInstance().SL_blueOff();
        }
    }
}
