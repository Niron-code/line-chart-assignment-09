package com.assignment.assignment09;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private LineChart mChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChart = (LineChart)findViewById(R.id.line_chart);

       // mChart.setOnChartGestureListener(MainActivity.this);
       // mChart.setOnChartValueSelectedListener(MainActivity.this);

        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(false);


        ArrayList<Entry> yValues = new ArrayList<>();

        yValues.add(new Entry(0,5));
        yValues.add(new Entry(1,5));
        yValues.add(new Entry(2,5));
        yValues.add(new Entry(3,0));
        yValues.add(new Entry(4,2));


        LineDataSet set = new LineDataSet(yValues, "Y Values");

        set.setFillAlpha(10);
        set.setColor(Color.RED);
        set.setLineWidth(2f);
        set.setDrawCircles(true);
        set.setDrawValues(true);
        set.setValueTextSize(12f);
        set.setCircleColor(Color.BLACK);
        set.setCircleHoleColor(Color.BLACK);


        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set);

        LineData data = new LineData(dataSets);

        mChart.setData(data);




    }
}