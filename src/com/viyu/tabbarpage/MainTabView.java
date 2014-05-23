package com.viyu.tabbarpage;

import android.support.v4.view.ViewPager;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.viyu.tabbarpage.page.AccountPageFragment;
import com.viyu.tabbarpage.page.HomePageFragment;
import com.viyu.tabbarpage.page.MorePageFragment;
import com.viyu.tabbarpage.page.SearchPageFragment;

public class MainTabView {

	public static final int TAB_INDEX_HOME = 0;
	public static final int TAB_INDEX_SEARCH = 1;
	public static final int TAB_INDEX_ACCOUNT = 2;
	public static final int TAB_INDEX_MORE = 3;

	public static final int TAB_COUNT = 4;

	private MainTabActivity mMainTabActivity = null;

	private ViewPager mViewPager = null;
	private RadioButton mTabHome = null;
	private RadioButton mTabSearch = null;
	private RadioButton mTabAccount = null;
	private RadioButton mTabMore = null;

	public MainTabView(MainTabActivity mainTabActivity) {
		mMainTabActivity = mainTabActivity;
		initUI();
	}

	public void changeSelectedPageOnTabCheckedChanged(CompoundButton buttonView) {
		mViewPager.setOnPageChangeListener(null);
		if (buttonView == mTabHome) {
			mViewPager.setCurrentItem(TAB_INDEX_HOME, true);
			
		} else if (buttonView == mTabSearch) {
			mViewPager.setCurrentItem(TAB_INDEX_SEARCH, true);
			
		} else if (buttonView == mTabAccount) {
			mViewPager.setCurrentItem(TAB_INDEX_ACCOUNT, true);
			
		} else if (buttonView == mTabMore) {
			mViewPager.setCurrentItem(TAB_INDEX_MORE, true);
			
		}
		mViewPager.setOnPageChangeListener(mMainTabActivity);
	}

	public void changeCheckedTabOnPageSelectedChanged(int index) {
		if (index > -1 && index < TAB_COUNT) {
			switch (index) {
			case TAB_INDEX_HOME:
				mTabHome.setOnCheckedChangeListener(null);
				mTabHome.setChecked(true);
				mTabHome.setOnCheckedChangeListener(mMainTabActivity);
				break;
			case TAB_INDEX_SEARCH:
				mTabSearch.setOnCheckedChangeListener(null);
				mTabSearch.setChecked(true);
				mTabSearch.setOnCheckedChangeListener(mMainTabActivity);
				break;
			case TAB_INDEX_ACCOUNT:
				mTabAccount.setOnCheckedChangeListener(null);
				mTabAccount.setChecked(true);
				mTabAccount.setOnCheckedChangeListener(mMainTabActivity);
				break;
			case TAB_INDEX_MORE:
				mTabMore.setOnCheckedChangeListener(null);
				mTabMore.setChecked(true);
				mTabMore.setOnCheckedChangeListener(mMainTabActivity);
				break;
			}
		}
	}

	private void initUI() {
		mMainTabActivity.setContentView(R.layout.activity_maintab);
		//
		mViewPager = (ViewPager) mMainTabActivity.findViewById(R.id.maintab_pager);
		BasePageFragment[] pages = new BasePageFragment[TAB_COUNT];
		pages[0] = new HomePageFragment();
		pages[1] = new SearchPageFragment();
		pages[2] = new AccountPageFragment();
		pages[3] = new MorePageFragment();
		PageFragmentAdapter adapter = new PageFragmentAdapter(mMainTabActivity.getSupportFragmentManager(), pages);
		mViewPager.setAdapter(adapter);
		mViewPager.setOffscreenPageLimit(TAB_COUNT - 1);
		mViewPager.setOnPageChangeListener(mMainTabActivity);
		//
		mTabHome = (RadioButton) mMainTabActivity.findViewById(R.id.maintab_tab_home);
		mTabHome.setOnCheckedChangeListener(mMainTabActivity);
		mTabSearch = (RadioButton) mMainTabActivity.findViewById(R.id.maintab_tab_search);
		mTabSearch.setOnCheckedChangeListener(mMainTabActivity);
		mTabAccount = (RadioButton) mMainTabActivity.findViewById(R.id.maintab_tab_account);
		mTabAccount.setOnCheckedChangeListener(mMainTabActivity);
		mTabMore = (RadioButton) mMainTabActivity.findViewById(R.id.maintab_tab_more);
		mTabMore.setOnCheckedChangeListener(mMainTabActivity);
	}
}