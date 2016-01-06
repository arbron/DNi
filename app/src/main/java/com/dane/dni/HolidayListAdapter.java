package com.dane.dni;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dane on 12/23/2015.
 */
public class HolidayListAdapter extends ArrayAdapter<DniHoliday> {

    private final LayoutInflater mInflater;

    private int mResource;

    public HolidayListAdapter(Context context, int resource, List<DniHoliday> objects) {
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
        TextView nameView;
        TextView dateView;

        if (convertView == null) {
            view = inflater.inflate(resource, parent, false);
        } else {
            view = convertView;
        }

        nameView = (TextView) view.findViewById(R.id.holidayName);
        dateView = (TextView) view.findViewById(R.id.holidayDate);

        DniHoliday item = getItem(position);
        nameView.setText(item.getName());
        dateView.setText((item.getVailee() + 1) + "/" + item.getYahr());

        return view;
    }
}