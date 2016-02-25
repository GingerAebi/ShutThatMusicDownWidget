package jeabong.nhnnext.org.shutthatmusicnotiwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class HelperActivity extends AppCompatActivity {

    private HelperActivity ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = this;
        String action = (String) getIntent().getExtras().get("DO");
        if(action.equals("hourIncrease")){
            Log.e("Helper","Start");
        }

        ArrayList<CafeInfo> cafeList = new ArrayList<>();
        cafeList.add(new CafeInfo("logo_cadi","CADI"));
        cafeList.add(new CafeInfo("logo_cat","고양이라서\n 다행이야"));
        cafeList.add(new CafeInfo("logo_bus","버스타세요"));
        cafeList.add(new CafeInfo("logo_cathouse","냥이네"));
        cafeList.add(new CafeInfo("logo_item","중고나라"));
        cafeList.add(new CafeInfo("logo_next","넥스트 짱"));
        cafeList.add(new CafeInfo("logo_dimigo","디미고"));
        cafeList.add(new CafeInfo("logo_test","수능"));

        ArrayList<Contents> contentList = new ArrayList<>();
        contentList.add(new Contents("[서울]3주차 개인미션","4기 민지연A","12 : 23", 0));
        contentList.add(new Contents("두번째 글입니다.","4기 이승주","03 : 23", 100));
        contentList.add(new Contents("하 귀찮은 데이터 작성","4기 이재봉","13 : 19", -20));
        contentList.add(new Contents("민지연씨 죄송합니다.","4기 죄송해요","14 : 54", 18));
        contentList.add(new Contents("가나다라마바사 블라블라","세종대왕","축시", 12));


    }

}
