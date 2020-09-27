package com.devtime.lerron.devtimetoken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TelaValidacao extends AppCompatActivity implements View.OnClickListener {

    private Button btnCompartilhar, btnCriaToken;
    private EditText txtSenha, txtToken;
    private Spinner spinnerMeses;
    private List<String> nomes = new ArrayList<String>();
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_validacao);

        //Adicionando Nomes no ArrayList
        nomes.add("Janeiro");
        nomes.add("Fevereiro");
        nomes.add("Março");
        nomes.add("Abril");
        nomes.add("Maio");
        nomes.add("Junho");
        nomes.add("Julho");
        nomes.add("Agosto");
        nomes.add("Setembro");
        nomes.add("Outubro");
        nomes.add("Novembro");
        nomes.add("Dezembro");

        txtSenha = (EditText) findViewById(R.id.txtSenha);
        txtToken = (EditText) findViewById(R.id.txtToken);

        btnCompartilhar = (Button) findViewById(R.id.btnCompartilhar);
        btnCriaToken = (Button) findViewById(R.id.btnCriaToken);

        btnCompartilhar.setOnClickListener(this);
        btnCriaToken.setOnClickListener(this);


        //Identifica o Spinner no layout
        spinnerMeses = (Spinner) findViewById(R.id.spinnerMeses);
        //Cria um ArrayAdapter usando um padrão de layout da classe R do android, passando o ArrayList nomes
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, nomes);
        ArrayAdapter<String> spinnerArrayAdapter = arrayAdapter;
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerMeses.setAdapter(spinnerArrayAdapter);

        //Método do Spinner para capturar o item selecionado
        spinnerMeses.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int posicao, long id) {
                //pega nome pela posição
                nome = parent.getItemAtPosition(posicao).toString();

                if (nome.equals("Janeiro")) {
                    txtSenha.setText("1");
                }
                if (nome.equals("Fevereiro")) {
                    txtSenha.setText("2");
                }
                if (nome.equals("Março")) {
                    txtSenha.setText("3");
                }
                if (nome.equals("Abril")) {
                    txtSenha.setText("4");
                }
                if (nome.equals("Maio")) {
                    txtSenha.setText("5");
                }
                if (nome.equals("Junho")) {
                    txtSenha.setText("6");
                }
                if (nome.equals("Julho")) {
                    txtSenha.setText("7");
                }
                if (nome.equals("Agosto")) {
                    txtSenha.setText("8");
                }
                if (nome.equals("Setembro")) {
                    txtSenha.setText("9");
                }
                if (nome.equals("Outubro")) {
                    txtSenha.setText("10");
                }
                if (nome.equals("Novembro")) {
                    txtSenha.setText("11");
                }
                if (nome.equals("Dezembro")) {
                    txtSenha.setText("12");
                }

                //imprime um Toast na tela com o nome que foi selecionado
                Toast.makeText(TelaValidacao.this, "Mês Selecionado: " + nome, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCompartilhar:

                Intent share = new Intent(android.content.Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

                share.putExtra(Intent.EXTRA_SUBJECT,
                        "Enviar Token...");
                share.putExtra(Intent.EXTRA_TEXT,
                        txtToken.getText().toString());

                startActivity(Intent.createChooser(share, "Compartilhar"));


                break;
            case R.id.btnCriaToken:

                String senha = txtSenha.getText().toString();

                //Toast.makeText(TelaValidacao.this, "Bom trabalho !" + senha, Toast.LENGTH_SHORT).show();

                //region Token 2017

                //JANEIRO
                if (senha.equals("1")) {
                    txtToken.setText("A6A8A4Rq5r215ght698C");
                }
                //FEVEREIRO
                if (senha.equals("2")) {
                    txtToken.setText("014QSR8d5r11tp2nh6S9");
                }
                //MARCO
                if (senha.equals("3")) {
                    txtToken.setText("atFiXrds254F9R88T52D");
                }
                //ABRIL
                if (senha.equals("4")) {
                    txtToken.setText("q98er52fv1nmSRPG54BV");
                }
                //MAIO
                if (senha.equals("5")) {
                    txtToken.setText("87uyhgTRF45T6Fk09GHf");
                }
                //JUNHO
                if (senha.equals("6")) {
                    txtToken.setText("kjhYT564FRwD8u7h6F4m");
                }
                //JULHO
                if (senha.equals("7")) {
                    txtToken.setText("hyTR435cds988hGG6FRD");
                }
                //AGOSTO
                if (senha.equals("8")) {
                    txtToken.setText("JUHytfre345tgfcJIUYg");
                }
                //SETEMBRO
                if (senha.equals("9")) {
                    txtToken.setText("5FDevbiEWxop084rfXZ2");
                }
                //OUTUBRO
                if (senha.equals("10")) {
                    txtToken.setText("UYHgtr453ed8IKMDWvhP");
                }
                //NOVEMBRO
                if (senha.equals("11")) {
                    txtToken.setText("hexpm7403RvdxHtFkO98");
                }
                //DEZEMBRO
                if (senha.equals("12")) {
                    txtToken.setText("0O9I8U7Yt5r4e3wdbVCw");
                }

                if (senha.equals("")) {
                    txtToken.setText("");
                }

                //endregion

                break;
        }
    }
}
