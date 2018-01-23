package com.sunilsaini.attendee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.andexert.calendarlistview.library.DayPickerView;
import com.andexert.calendarlistview.library.SimpleMonthAdapter;

public class event_date_activity extends AppCompatActivity implements com.andexert.calendarlistview.library.DatePickerController{

    private DayPickerView dayPickerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_date_activity);
        dayPickerView = (DayPickerView) findViewById(R.id.pickerView);
        dayPickerView.setController(this);
    }

    @Override
    public int getMaxYear() {
        return 2025;
    }

    @Override
    public void onDayOfMonthSelected(int year, int month, int day) {
        Log.e("Day Selected", day + " / " + month + " / " + year);

    }

    @Override
    public void onDateRangeSelected(SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays) {
        Log.e("Date range selected", selectedDays.getFirst().toString() + " --> " + selectedDays.getLast().toString());
    }
}
