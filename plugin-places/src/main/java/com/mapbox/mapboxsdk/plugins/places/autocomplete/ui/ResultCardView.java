package com.mapbox.mapboxsdk.plugins.places.autocomplete.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.mapbox.mapboxsdk.places.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ResultCardView extends ResultView {

  public ResultCardView(@NonNull Context context) {
    this(context, null);
  }

  public ResultCardView(@NonNull Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, -1);
  }

  public ResultCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  void inflateView(Context context) {
    inflate(context, R.layout.mapbox_view_card_results, this);
  }
}
