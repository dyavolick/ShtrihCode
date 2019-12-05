package ru.athex.shtrihcodelog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText tbValidation;
    private TextView lbValidationInfo;
    private TextView lbProducerInfo;
    private ConstraintLayout llAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llAll =(ConstraintLayout)findViewById(R.id.llAll);
        tbValidation= (EditText)findViewById(R.id.tbValidation);
        lbProducerInfo = (TextView)findViewById(R.id.lbProducerInfo);
        lbValidationInfo = (TextView)findViewById(R.id.lbValidationInfo);
    }



    public void btnValidation_Click(View v)
    {
        String Code = tbValidation.getText().toString();
        if (Code.length()>3)
        {
            if (OriginalOrFake(Code)){
                lbValidationInfo.setText("Оригинал! Вам повезло!");
                llAll.setBackgroundResource(R.color.greenColor);
            }
            else
            {
                lbValidationInfo.setText("Made in Подвал");
                llAll.setBackgroundResource(R.color.redColor);
            }
            lbProducerInfo.setText("Производитель: "+ProducerInfo(Code));
        }
    }

    public Boolean OriginalOrFake(String In)
    {
        int Chetnue, NeChetnue, ChetnueAndNeChetnue, result;
        String tmpstring = "";
        Chetnue = Integer.parseInt(In.substring(1, 2)) + Integer.parseInt(In.substring(3, 4)) +
                Integer.parseInt(In.substring(5, 6)) + Integer.parseInt(In.substring(7, 8)) +
                Integer.parseInt(In.substring(9, 10)) + Integer.parseInt(In.substring(11, 12));
        NeChetnue = Integer.parseInt(In.substring(0, 1)) + Integer.parseInt(In.substring(2, 3)) +
                Integer.parseInt(In.substring(4, 5)) + Integer.parseInt(In.substring(6, 7)) +
                Integer.parseInt(In.substring(8, 9)) + Integer.parseInt(In.substring(10, 11));
        ChetnueAndNeChetnue = Chetnue * 3 + NeChetnue;
        for (int i = 1; i <  Integer.toString(ChetnueAndNeChetnue).length(); i++)
        { tmpstring = tmpstring + Integer.toString(ChetnueAndNeChetnue).substring(i,(i+1)); }
        result = 10 - Integer.parseInt(tmpstring);
        if (result == Integer.parseInt(In.substring(12, 13)))
            return true;
        return false;
    }

    public String ProducerInfo(String In)
    {
        int ProducerCode = Integer.parseInt(In.substring(0, 3));

        if ((ProducerCode >= 000) && (ProducerCode <= 139)) { return "США, Канада"; }//00-09

        else if ((ProducerCode >= 300) && (ProducerCode <= 379)) { return "Франция"; }//30-37
        else if (ProducerCode == 380) { return "Болгария"; }//380
        else if (ProducerCode == 383) { return "Словения"; }//383
        else if (ProducerCode == 385) { return "Хорватия"; }//385
        else if (ProducerCode == 387) { return "Босния-Герцеговина"; }//387

        else if ((ProducerCode >= 400) && (ProducerCode <= 440)) { return "Германия"; }//400-440
        else if ((ProducerCode >= 450) && (ProducerCode <= 459)) { return "Япония"; }//450-459
        else if ((ProducerCode >= 460) && (ProducerCode <= 469)) { return "Россия"; }//46
        else if (ProducerCode == 470) { return "Кыргызстан"; }//470
        else if (ProducerCode == 471) { return "Тайвань"; }//471
        else if (ProducerCode == 474) { return "Эстония"; }//474
        else if (ProducerCode == 475) { return "Латвия"; }//475
        else if (ProducerCode == 476) { return "Азербайджан"; }//476
        else if (ProducerCode == 477) { return "Литва"; }//477
        else if (ProducerCode == 478) { return "Узбекистан"; }//478
        else if (ProducerCode == 479) { return "Шри-Ланка"; }//479
        else if (ProducerCode == 480) { return "Филиппины"; }//480
        else if (ProducerCode == 481) { return "Беларусь"; }//481
        else if (ProducerCode == 482) { return "Украина"; }//482
        else if (ProducerCode == 484) { return "Молдова"; }//484
        else if (ProducerCode == 485) { return "Армения"; }//485
        else if (ProducerCode == 486) { return "Грузия"; }//486
        else if (ProducerCode == 487) { return "Казахстан"; }//487
        else if (ProducerCode == 489) { return "Гонконг"; }//489
        else if ((ProducerCode >= 491) && (ProducerCode <= 499)) { return "Япония"; }//491-499

        else if (ProducerCode == 520) { return "Греция"; }
        else if (ProducerCode == 528) { return "Ливан"; }
        else if (ProducerCode == 529) { return "Кипр"; }
        else if (ProducerCode == 530) { return "Албания"; }
        else if (ProducerCode == 531) { return "Македония"; }
        else if (ProducerCode == 535) { return "Мальта"; }
        else if (ProducerCode == 539) { return "Ирландия"; }
        else if ((ProducerCode >= 540) && (ProducerCode <= 549)) { return "Бельгия, Люксембург"; }
        else if (ProducerCode == 560) { return "Португалия"; }
        else if (ProducerCode == 569) { return "Исландия"; }
        else if ((ProducerCode >= 570) && (ProducerCode <= 579)) { return "Дания"; }
        else if (ProducerCode == 590) { return "Польша"; }
        else if (ProducerCode == 594) { return "Румыния"; }
        else if (ProducerCode == 599) { return "Венгрия"; }

        else if ((ProducerCode >= 600) && (ProducerCode <= 601)) { return "Южная Африка"; }
        else if (ProducerCode == 603) { return "Гана"; }
        else if (ProducerCode == 608) { return "Бахрейн"; }
        else if (ProducerCode == 609) { return "Маврикий"; }
        else if (ProducerCode == 611) { return "Марокко"; }
        else if (ProducerCode == 613) { return "Алжир"; }
        else if (ProducerCode == 616) { return "Кения"; }
        else if (ProducerCode == 618) { return "Берег Слоновой Кости"; }
        else if (ProducerCode == 619) { return "Тунис"; }
        else if (ProducerCode == 621) { return "Сирия"; }
        else if (ProducerCode == 622) { return "Египет"; }
        else if (ProducerCode == 624) { return "Ливия"; }
        else if (ProducerCode == 625) { return "Иордания"; }
        else if (ProducerCode == 626) { return "Иран"; }
        else if (ProducerCode == 627) { return "Кувейт"; }
        else if (ProducerCode == 628) { return "Саудовская Аравия"; }
        else if (ProducerCode == 629) { return "ОАЭ"; }
        else if ((ProducerCode >= 640) && (ProducerCode <= 649)) { return "Финляндия"; }
        else if ((ProducerCode >= 690) && (ProducerCode <= 695)) { return "Китай"; }

        else if ((ProducerCode >= 700) && (ProducerCode <= 709)) { return "Норвегия"; }
        else if (ProducerCode == 729) { return "Израиль"; }
        else if ((ProducerCode >= 730) && (ProducerCode <= 739)) { return "Швеция"; }
        else if (ProducerCode == 740) { return "Гватемала"; }
        else if (ProducerCode == 741) { return "Сальвадор"; }
        else if (ProducerCode == 742) { return "Гондурас"; }
        else if (ProducerCode == 743) { return "Никарагуа"; }
        else if (ProducerCode == 744) { return "Коста-Рика"; }
        else if (ProducerCode == 745) { return "Панама"; }
        else if (ProducerCode == 746) { return "Доминиканская республика"; }
        else if (ProducerCode == 750) { return "Мексика"; }
        else if ((ProducerCode >= 754) && (ProducerCode <= 755)) { return "Канада"; }
        else if (ProducerCode == 759) { return "Венесуэла"; }
        else if ((ProducerCode >= 760) && (ProducerCode <= 769)) { return "Швейцария"; }
        else if (ProducerCode == 770) { return "Колумбия"; }
        else if (ProducerCode == 773) { return "Уругвай"; }
        else if (ProducerCode == 775) { return "Перу"; }
        else if (ProducerCode == 777) { return "Боливия"; }
        else if (ProducerCode == 779) { return "Аргентина"; }
        else if (ProducerCode == 780) { return "Чили"; }
        else if (ProducerCode == 784) { return "Парагвай"; }
        else if (ProducerCode == 786) { return "Эквадор"; }
        else if ((ProducerCode >= 789) && (ProducerCode <= 790)) { return "Бразилия"; }

        else if ((ProducerCode >= 800) && (ProducerCode <= 839)) { return "Италия"; }
        else if ((ProducerCode >= 840) && (ProducerCode <= 849)) { return "Испания"; }
        else if (ProducerCode == 850) { return "Куба"; }
        else if (ProducerCode == 858) { return "Словакия"; }
        else if (ProducerCode == 859) { return "Чехия"; }
        else if (ProducerCode == 860) { return "Сербия и Черногория"; }
        else if (ProducerCode == 865) { return "Монголия"; }
        else if (ProducerCode == 867) { return "Северная Корея"; }
        else if (ProducerCode == 869) { return "Турция"; }
        else if ((ProducerCode >= 870) && (ProducerCode <= 879)) { return "Нидерланды"; }
        else if (ProducerCode == 880) { return "Южная Корея"; }
        else if (ProducerCode == 884) { return "Камбоджа"; }
        else if (ProducerCode == 885) { return "Таиланд"; }
        else if (ProducerCode == 888) { return "Сингапур"; }
        else if (ProducerCode == 890) { return "Индия"; }
        else if (ProducerCode == 893) { return "Вьетнам"; }
        else if (ProducerCode == 899) { return "Индонезия"; }

        else if ((ProducerCode >= 900) && (ProducerCode <= 919)) { return "Австрия"; }
        else if ((ProducerCode >= 930) && (ProducerCode <= 939)) { return "Австралия"; }
        else if ((ProducerCode >= 940) && (ProducerCode <= 949)) { return "Новая Зеландия"; }
        else if (ProducerCode == 950) { return "Главный офис"; }
        else if (ProducerCode == 955) { return "Малайзия"; }
        else if (ProducerCode == 958) { return "Макао"; }

        else if ((ProducerCode >= 978) && (ProducerCode <= 979)) { return "Книги (ISBN)"; }
        else if (ProducerCode == 980) { return "Возвратные квитанции"; }
        else if ((ProducerCode >= 981) && (ProducerCode <= 982)) { return "Валютные купоны"; }
        else if ((ProducerCode >= 990) && (ProducerCode <= 999)) { return "Купоны"; }
        else return "Ненайден";
    }

}
