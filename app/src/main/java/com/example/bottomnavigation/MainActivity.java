//package com.example.bottomnavigation;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.viewpager2.widget.ViewPager2;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.FrameLayout;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationBarView;
//import com.google.android.material.tabs.TabLayout;
//
//public class MainActivity extends AppCompatActivity {
//    TabLayout tabLayout;
//    ViewPager2 viewPager2;
//    ViewPagerAdapter viewPagerAdapter;
//    BottomNavigationView bottomNavigationView;
//    FrameLayout frameLayout;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main1);
//
//        tabLayout = findViewById(R.id.tablayout);
//        viewPager2 = findViewById(R.id.viewPager);
//       viewPagerAdapter = new ViewPagerAdapter(this);
//        viewPager2.setAdapter(viewPagerAdapter);
//        bottomNavigationView = findViewById(R.id.bottom);
//        frameLayout = findViewById(R.id.frame);
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager2.setVisibility(View.VISIBLE);
//                frameLayout.setVisibility(View.GONE);
//                viewPager2.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                viewPager2.setVisibility(View.GONE);
//                frameLayout.setVisibility(View.VISIBLE);
//            }
//        });
//        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            /**
//             * This method will be invoked when a new page becomes selected. Animation is not
//             * necessarily complete.
//             *
//             * @param position Position index of the new selected page.
//             */
//            @Override
//            public void onPageSelected(int position) {
//                frameLayout.setVisibility(View.VISIBLE);
//                viewPager2.setVisibility(View.GONE);
//                switch (position) {
//                    case 0:
//                    case 1:
//                    case 2:
//                        tabLayout.getTabAt(position).select();
//                }
//                super.onPageSelected(position);
//            }
//        });
//
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @SuppressLint("NonConstantResourceId")
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////                switch (item.getItemId()) {
////                    case R.id.bottom_home:
////                        getSupportFragmentManager().beginTransaction()
////                                .replace(R.id.frame, new FragmentHome()).commit();
////                        return true;
////
////
////                    case R.id.bottom_portfolio:
////                        getSupportFragmentManager().beginTransaction()
////                                .replace(R.id.frame, new Fragment_portfolio()).commit();
////                        return true;
////
////                    case R.id.bottom_watchlist:
////                        getSupportFragmentManager().beginTransaction()
////                                .replace(R.id.frame, new Fragment_watchlist()).commit();
////                        return true;
////                }
////                return false;
//                int itemId = item.getItemId();
//                if (itemId == R.id.bottom_home) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.frame, new FragmentHome()).commit();
//                    return true;
//                } else if (itemId == R.id.bottom_portfolio) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.frame, new Fragment_portfolio()).commit();
//                    return true;
//                } else if (itemId == R.id.bottom_watchlist) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.frame, new Fragment_watchlist()).commit();
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });
//
//    }
//
//}
