package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;



import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WatchlistActivity extends AppCompatActivity {

        private BottomNavigationView bottomNavigationView;

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_watchlist);

            bottomNavigationView = findViewById(R.id.bottom_navigator2);
            bottomNavigationView.setSelectedItemId(R.id.menu_watchlist);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @SuppressLint("NonConstantResourceId")
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////                switch (item.getItemId()) {
////                    case R.id.menu_home:
//////                        startActivity(new Intent(getApplicationContext(), MainActivity1.class));
//////                        overridePendingTransition(0,0);
////                        return true;
////
////                    case R.id.menu_watchlist:
//                        startActivity(new Intent(getApplicationContext(), WatchlistActivity.class));
//                        overridePendingTransition(0, 0);
//                        return true;
////                    case R.id.menu_portfolio:
//                        startActivity(new Intent(getApplicationContext(), PortFolioActivity.class));
//                        overridePendingTransition(0, 0);
//                        return true;
////
////                }
////                return false;
////            }
////        });
////    }
////}
                    int itemId = item.getItemId();
                    if (itemId == R.id.menu_home) {
                        startActivity(new Intent(getApplicationContext(), MainActivity1.class));
                        overridePendingTransition(0, 0);

                        return true;
                    } else if (itemId == R.id.menu_portfolio) {
                        startActivity(new Intent(getApplicationContext(), PortFolioActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    } else if (itemId == R.id.menu_watchlist) {

                        return true;
                    } else {
                        return false;
                    }
                }
            });

        }

    }

//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////                switch (item.getItemId()) {
////                    case R.id.menu_home:
////                        // Handle Home item click
////                        Toast.makeText(MainActivity1.this, "Home clicked", Toast.LENGTH_SHORT).show();
////                        return true;
////                    case R.id.menu_watchlist:
////                        // Handle Watchlist item click
////                        Toast.makeText(MainActivity1.this, "Watchlist clicked", Toast.LENGTH_SHORT).show();
////                        return true;
////                    case R.id.menu_portfolio:
////                        // Handle Portfolio item click
////                        Toast.makeText(MainActivity1.this, "Portfolio clicked", Toast.LENGTH_SHORT).show();
////                        return true;
////                    default:
////                        return false;
////                }
////            }
////        });
////    }
////}
//                int itemId = item.getItemId();
//                if (itemId == R.id.bottom_home) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.frame, new FragmentHome()).commit();
//                    return true;
//                } else if (itemId == R.id.bottom_portfolio) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.frame, new Fragment_portfolio()).commit();
//                    Intent intent = new Intent(MainActivity1.this, Portfolio.class);
//                    startActivity(intent);
//
//                    return true;
//                } else if (itemId == R.id.bottom_watchlist) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.frame, new Fragment_watchlist()).commit();
//
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
