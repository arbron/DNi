package com.dane.dni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dane on 2/4/2016.
 */
public class AlarmListAdapter extends ArrayAdapter<AlarmData> {

    private final LayoutInflater mInflater;

    private int mResource;

    public AlarmListAdapter(Context context, int resource, List<AlarmData> objects) {
        super(context, resource, objects);
        mInflater = LayoutInflater.from(context);
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return createViewFromResource(mInflater, position, convertView, parent, mResource);
    }

    private View createViewFromResource(LayoutInflater inflater, int position, View convertView,
                                        ViewGroup parent, int resource) {
        View view;

        if (convertView == null) {
            view = inflater.inflate(resource, parent, false);
        } else {
            view = convertView;
        }

        AlarmData item = getItem(position);

        TextView alarmDisplay = (TextView) view.findViewById(R.id.alarmDisplay);
        alarmDisplay.setText(String.format("%d : %d : %d : %02d : %02d",
                item.getShift(), item.getHour(), item.getQuarter(), item.getMinute(),
                item.getSecond()));

        Switch enabledSwitch = (Switch) view.findViewById(R.id.enableAlarm);
        enabledSwitch.setChecked(item.isEnabled());

        return view;
    }
}
