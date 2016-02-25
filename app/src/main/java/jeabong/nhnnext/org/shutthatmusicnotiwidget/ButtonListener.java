package jeabong.nhnnext.org.shutthatmusicnotiwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


/**
 * Created by JaeBong on 16. 2. 15..
 */
public class ButtonListener extends BroadcastReceiver {

    Context ctx;

    @Override
    public void onReceive(Context context, Intent intent) {
        this.ctx = context;
        String Action = intent.getAction();
        if (Action.equals("jaebong.nhnnext.org.startreciever")) {
            MyNotification.getMyNotiInstance(context);
        }

        Intent activity = new Intent(ctx, SettingActivity.class);
        activity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(activity);

        //show the notification
        MyNotification.getMyNotiInstance(context);
    }

}
