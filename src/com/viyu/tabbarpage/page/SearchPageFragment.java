package com.viyu.tabbarpage.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viyu.tabbarpage.BasePageFragment;
import com.viyu.tabbarpage.R;

public class SearchPageFragment extends BasePageFragment {

	@Override
	protected View initUI(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_page_search, null);
	}
}