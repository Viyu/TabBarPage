package com.viyu.tabbarpage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BasePageFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return initUI(inflater, container, savedInstanceState);
	}
	
	/**
	 * 由实现类去初始化具体的UI
	 * @param inflater
	 * @param container
	 * @param savedInstanceState
	 * @return
	 */
	protected abstract View initUI(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
}