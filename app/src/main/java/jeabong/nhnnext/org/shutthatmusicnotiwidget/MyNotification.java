package jeabong.nhnnext.org.shutthatmusicnotiwidget;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

/**
 * Created by JaeBong on 16. 2. 15..
 */
public class MyNotification extends Notification {

    private Context context;
    private static MyNotification myNotiInstance;
    private NotificationManager mNotificationManager;

    private MyNotification(Context context) {
        super();
        this.context = context;
        notificationSetting();
    }

    public static MyNotification getMyNotiInstance(Context context) {
        if (myNotiInstance == null) {
            myNotiInstance = new MyNotification(context);
            return myNotiInstance;
        } else {
            return myNotiInstance;
        }
    }

    private void notificationSetting() {
        String ns = Context.NOTIFICATION_SERVICE;
        mNotificationManager = (NotificationManager) context.getSystemService(ns);
        CharSequence text = "Shut Music";
        long when = System.currentTimeMillis();

        Notification.Builder builder = new Notification.Builder(context);
        Notification notification = builder.getNotification();

        notification.when = when;
        notification.tickerText = text;
        notification.icon = R.drawable.notification_template_icon_bg;


        RemoteViews contentView = new RemoteViews(context.getPackageName(), R.layout.layout_shutthatmusic_noti_widget);

        //set the button listeners
        setListeners(contentView);

        notification.contentView = contentView;
        notification.flags |= FLAG_ONGOING_EVENT;
        notification.flags |= FLAG_NO_CLEAR;

        CharSequence contentTitle = "From Shortcuts";
        mNotificationManager.notify(548853, notification);


    }

    public void setListeners(RemoteViews view) {
        Intent hourIncrease = new Intent(context, HelperActivity.class);
        hourIncrease.putExtra("DO", "HourIncrease");
        PendingIntent pendingHourIncrease = PendingIntent.getBroadcast(context, 0, hourIncrease, PendingIntent.FLAG_UPDATE_CURRENT);
        view.setOnClickPendingIntent(R.id.button_hour_increase, pendingHourIncrease);
    }
}
