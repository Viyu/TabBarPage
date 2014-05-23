package com.viyu.tabbarpage;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainTabActivity extends FragmentActivity implements OnCheckedChangeListener, OnPageChangeListener {

	private MainTabView mView = null;
	
	private int mCurrentPageIndex = MainTabView.TAB_INDEX_HOME;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mView = new MainTabView(this);
		if(savedInstanceState == null) {
			mCurrentPageIndex =  MainTabView.TAB_INDEX_HOME;
		} else {
			//TODO
		}
		mView.changeCheckedTabOnPageSelectedChanged(mCurrentPageIndex);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(isChecked) {
			mView.changeSelectedPageOnTabCheckedChanged(buttonView);
		}
	}

	@Override
	public void onPageSelected(int index) {
		mView.changeCheckedTabOnPageSelectedChanged(index);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	};
}
