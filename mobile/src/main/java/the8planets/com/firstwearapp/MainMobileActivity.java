package the8planets.com.firstwearapp;

import android.app.Notification;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainMobileActivity extends AppCompatActivity {

    private Button button;

    NotificationManagerCompat notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mobile);

        notificationManager = NotificationManagerCompat.from(this);

        button = (Button) findViewById(R.id.app_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNotifications();
            }
        });

    }



    private void sendNotifications() {

        NotificationCompat.WearableExtender wearFeatures = new NotificationCompat.WearableExtender();

        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Hello Wear")
                .setContentText("My first wear notification!")
                .extend(wearFeatures)
                .build();

        notificationManager.notify(101, notification);

    }


}
