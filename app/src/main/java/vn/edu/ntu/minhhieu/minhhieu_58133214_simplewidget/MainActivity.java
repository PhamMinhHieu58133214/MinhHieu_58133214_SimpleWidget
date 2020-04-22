package vn.edu.ntu.minhhieu.minhhieu_58133214_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtNgaySinh,edtSoThichKhac;
    RadioGroup rdgGioiTinh;
    CheckBox cbPhim,cbMP3,cbCafe,cbAlone,cbNauAn;
    Button btnXacNhan; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addViews();
        addEvents();
    }
    private void addViews(){
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThichKhac = findViewById((R.id.edtSoThichKhac));
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        cbPhim =  findViewById(R.id.cbPhim);
        cbMP3 = findViewById(R.id.cbMP3);
        cbCafe =  findViewById(R.id.cbCafe);
        cbAlone =  findViewById(R.id.cbAlone);
        cbNauAn = findViewById(R.id.cbNauAn);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    private void addEvents(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   XacNhan();
            }
        });
    }
    private void XacNhan(){
        StringBuilder result=new StringBuilder();
        result.append("Tên:" + edtTen.getText().toString() + "\n" + "Giới tính:" + edtNgaySinh.getText().toString() + "\n");
        result.append("Giới tính:");
        switch (rdgGioiTinh.getCheckedRadioButtonId()){
            case R.id.rbNam:
                result.append("Nam");
                break;
            case R.id.rbNu:
                result.append("Nữ");
        }
        result.append("\n" + "Sở thích:");
        if(cbPhim.isChecked()){
            result.append("Xem phim, ");
        }
        if(cbMP3.isChecked()){
            result.append("Nghe Nhạc, ");
        }
        if(cbCafe.isChecked()){
            result.append("Đi cafe với bạn, ");
        }
        if(cbAlone.isChecked()){
            result.append("Ở nhà mình mình, ");
        }
        if(cbNauAn.isChecked()){
            result.append("Vào bếp nâu ăn, ");
        }
        result.append(edtSoThichKhac.getText().toString());
        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }
}
