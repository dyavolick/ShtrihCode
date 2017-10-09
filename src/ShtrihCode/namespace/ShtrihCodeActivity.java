package ShtrihCode.namespace;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShtrihCodeActivity extends Activity {
	private EditText tbValidation;
	private TextView lbValidationInfo;
	private TextView lbProducerInfo;
	private LinearLayout llAll;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        llAll =(LinearLayout)findViewById(R.id.llAll);
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
    	        lbValidationInfo.setText("��������! ��� �������!");
    	        llAll.setBackgroundResource(R.color.greenColor);
    		}
    		else
    		{
    			lbValidationInfo.setText("Made in ������");
    			llAll.setBackgroundResource(R.color.redColor);
    		}
    	lbProducerInfo.setText("�������������: "+ProducerInfo(Code));
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

        if ((ProducerCode >= 000) && (ProducerCode <= 139)) { return "���, ������"; }//00-09

        else if ((ProducerCode >= 300) && (ProducerCode <= 379)) { return "�������"; }//30-37
        else if (ProducerCode == 380) { return "��������"; }//380
        else if (ProducerCode == 383) { return "��������"; }//383            
        else if (ProducerCode == 385) { return "��������"; }//385
        else if (ProducerCode == 387) { return "������-�����������"; }//387

        else if ((ProducerCode >= 400) && (ProducerCode <= 440)) { return "��������"; }//400-440
        else if ((ProducerCode >= 450) && (ProducerCode <= 459)) { return "������"; }//450-459
        else if ((ProducerCode >= 460) && (ProducerCode <= 469)) { return "������"; }//46
        else if (ProducerCode == 470) { return "����������"; }//470
        else if (ProducerCode == 471) { return "�������"; }//471
        else if (ProducerCode == 474) { return "�������"; }//474
        else if (ProducerCode == 475) { return "������"; }//475
        else if (ProducerCode == 476) { return "�����������"; }//476
        else if (ProducerCode == 477) { return "�����"; }//477
        else if (ProducerCode == 478) { return "����������"; }//478
        else if (ProducerCode == 479) { return "���-�����"; }//479
        else if (ProducerCode == 480) { return "���������"; }//480
        else if (ProducerCode == 481) { return "��������"; }//481
        else if (ProducerCode == 482) { return "�������"; }//482
        else if (ProducerCode == 484) { return "�������"; }//484
        else if (ProducerCode == 485) { return "�������"; }//485
        else if (ProducerCode == 486) { return "������"; }//486
        else if (ProducerCode == 487) { return "���������"; }//487
        else if (ProducerCode == 489) { return "�������"; }//489
        else if ((ProducerCode >= 491) && (ProducerCode <= 499)) { return "������"; }//491-499

        else if (ProducerCode == 520) { return "������"; }
        else if (ProducerCode == 528) { return "�����"; }
        else if (ProducerCode == 529) { return "����"; }
        else if (ProducerCode == 530) { return "�������"; }
        else if (ProducerCode == 531) { return "���������"; }
        else if (ProducerCode == 535) { return "������"; }
        else if (ProducerCode == 539) { return "��������"; }
        else if ((ProducerCode >= 540) && (ProducerCode <= 549)) { return "�������, ����������"; }
        else if (ProducerCode == 560) { return "����������"; }
        else if (ProducerCode == 569) { return "��������"; }
        else if ((ProducerCode >= 570) && (ProducerCode <= 579)) { return "�����"; }
        else if (ProducerCode == 590) { return "������"; }
        else if (ProducerCode == 594) { return "�������"; }
        else if (ProducerCode == 599) { return "�������"; }

        else if ((ProducerCode >= 600) && (ProducerCode <= 601)) { return "����� ������"; }
        else if (ProducerCode == 603) { return "����"; }
        else if (ProducerCode == 608) { return "�������"; }
        else if (ProducerCode == 609) { return "��������"; }
        else if (ProducerCode == 611) { return "�������"; }
        else if (ProducerCode == 613) { return "�����"; }
        else if (ProducerCode == 616) { return "�����"; }
        else if (ProducerCode == 618) { return "����� �������� �����"; }
        else if (ProducerCode == 619) { return "�����"; }
        else if (ProducerCode == 621) { return "�����"; }
        else if (ProducerCode == 622) { return "������"; }
        else if (ProducerCode == 624) { return "�����"; }
        else if (ProducerCode == 625) { return "��������"; }
        else if (ProducerCode == 626) { return "����"; }
        else if (ProducerCode == 627) { return "������"; }
        else if (ProducerCode == 628) { return "���������� ������"; }
        else if (ProducerCode == 629) { return "���"; }
        else if ((ProducerCode >= 640) && (ProducerCode <= 649)) { return "���������"; }
        else if ((ProducerCode >= 690) && (ProducerCode <= 695)) { return "�����"; }

        else if ((ProducerCode >= 700) && (ProducerCode <= 709)) { return "��������"; }
        else if (ProducerCode == 729) { return "�������"; }
        else if ((ProducerCode >= 730) && (ProducerCode <= 739)) { return "������"; }
        else if (ProducerCode == 740) { return "���������"; }
        else if (ProducerCode == 741) { return "���������"; }
        else if (ProducerCode == 742) { return "��������"; }
        else if (ProducerCode == 743) { return "���������"; }
        else if (ProducerCode == 744) { return "�����-����"; }
        else if (ProducerCode == 745) { return "������"; }
        else if (ProducerCode == 746) { return "������������� ����������"; }
        else if (ProducerCode == 750) { return "�������"; }
        else if ((ProducerCode >= 754) && (ProducerCode <= 755)) { return "������"; }
        else if (ProducerCode == 759) { return "���������"; }
        else if ((ProducerCode >= 760) && (ProducerCode <= 769)) { return "���������"; }
        else if (ProducerCode == 770) { return "��������"; }
        else if (ProducerCode == 773) { return "�������"; }
        else if (ProducerCode == 775) { return "����"; }
        else if (ProducerCode == 777) { return "�������"; }
        else if (ProducerCode == 779) { return "���������"; }
        else if (ProducerCode == 780) { return "����"; }
        else if (ProducerCode == 784) { return "��������"; }
        else if (ProducerCode == 786) { return "�������"; }
        else if ((ProducerCode >= 789) && (ProducerCode <= 790)) { return "��������"; }

        else if ((ProducerCode >= 800) && (ProducerCode <= 839)) { return "������"; }
        else if ((ProducerCode >= 840) && (ProducerCode <= 849)) { return "�������"; }
        else if (ProducerCode == 850) { return "����"; }
        else if (ProducerCode == 858) { return "��������"; }
        else if (ProducerCode == 859) { return "�����"; }
        else if (ProducerCode == 860) { return "������ � ����������"; }
        else if (ProducerCode == 865) { return "��������"; }
        else if (ProducerCode == 867) { return "�������� �����"; }
        else if (ProducerCode == 869) { return "������"; }
        else if ((ProducerCode >= 870) && (ProducerCode <= 879)) { return "����������"; }
        else if (ProducerCode == 880) { return "����� �����"; }
        else if (ProducerCode == 884) { return "��������"; }
        else if (ProducerCode == 885) { return "�������"; }
        else if (ProducerCode == 888) { return "��������"; }
        else if (ProducerCode == 890) { return "�����"; }
        else if (ProducerCode == 893) { return "�������"; }
        else if (ProducerCode == 899) { return "���������"; }

        else if ((ProducerCode >= 900) && (ProducerCode <= 919)) { return "�������"; }
        else if ((ProducerCode >= 930) && (ProducerCode <= 939)) { return "���������"; }
        else if ((ProducerCode >= 940) && (ProducerCode <= 949)) { return "����� ��������"; }
        else if (ProducerCode == 950) { return "������� ����"; }
        else if (ProducerCode == 955) { return "��������"; }
        else if (ProducerCode == 958) { return "�����"; }
        else return "��������";
    }
    
    
}