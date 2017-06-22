import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by use on 22.06.17.
 */
public class HomeScreenWidgetProvider extends AppWidgetProvider {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yy hh:mm a");

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        String currentTime = simpleDateFormat.format(new Date());
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.main);
        remoteViews.setTextViewText(R.id.text, currentTime);
        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
        Toast.makeText(context, "Update", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
        Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        Toast.makeText(context, "Enable", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
        Toast.makeText(context, "Disable", Toast.LENGTH_SHORT).show();
    }
}
