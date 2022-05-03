package com.example.ndactivity.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ndactivity.R;
import com.example.ndactivity.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.txtProceso;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    TextView proceso, resultado;
    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, resta, suma, multiplicacion, division, punto, porcentaje, borrar, parentesisderecho, cubo, igual, borraruno, parentesisizquierdo, cuadrado, raiz;
    String procesof;
    @Override
    public void onViewCreated(@NonNull layoutInflater Inflater,
                              ViewGroup container, Bundle savedInstanceState){
        View view=Inflater.inflate(R.layout.fragment_blank.container, false);

            proceso=view.findViewById( R.id.txtProceso);
            resultado=view.findViewById(R.id.txtResultado);
            suma=view.findViewById(R.id.btnSuma);
            resta=view.findViewById(R.id.btnRestar);
            multiplicacion=view.findViewById(R.id.btnMultiplicar);
            division=view.findViewById(R.id.btnDivision);
            punto=view.findViewById(R.id.btnPunto);
            porcentaje=view.findViewById(R.id.btnPorcentaje);
            parentesisderecho=view.findViewById(R.id.btnParenD);
            parentesisizquierdo=view.findViewById(R.id.btnParenI);

            cero=view.findViewById(R.id.btnCero);
            uno= view.findViewById(R.id.btnUno);
            dos=view.findViewById(R.id.btnDos);
            tres=view.findViewById(R.id.btnTres);
            cuatro=view.findViewById(R.id.btnCuatro);
            cinco=view.findViewById(R.id.btnCinco);
            seis=view.findViewById(R.id.btnSeis);
            siete=view.findViewById(R.id.btnSiete);
            ocho=view.findViewById(R.id.btnOcho);
            nueve= view.findViewById(R.id.btnNueve);
            borrar= view.findViewById(R.id.btnBorrartodo);
            cubo= view.findViewById(R.id.btnCubo);
            igual=view.findViewById(R.id.btnIgual);
            borraruno=view.findViewById(R.id.btnBorrarUno);
            cuadrado=view.findViewById(R.id.btnCuadrado);
            raiz=view.findViewById(R.id.btnRaiz);


            cero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                     procesof = proceso.getText().toString();
                    proceso.setText(procesof+"0");
                }
            });
            uno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"1");
                }
            });
            dos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"2");
                }
            });
            tres.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"3");
                }
            });
            cuatro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"4");
                }
            });
            cinco.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"5");
                }
            });
            seis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"6");
                }
            });
            siete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"7");
                }
            });
            ocho.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"8");
                }
            });
            nueve.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"9");
                }
            });

            suma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"+");
                }
            });
            resta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"-");
                }
            });
            multiplicacion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"x");
                }
            });
            division.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"/");
                }
            });

            punto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+".");
                }
            });
            porcentaje.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"%");
                }
            });

            parentesisizquierdo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+"(");
                }
            });

            parentesisderecho.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    procesof = proceso.getText().toString();
                    proceso.setText(procesof+")");
                }
            });

            cubo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Double procesof = Double.parseDouble(proceso.getText().toString());
                    Double respuesta = Math.pow(procesof,3);
                    String respuesta2 = String.valueOf(respuesta);
                    proceso.setText(respuesta2);
                }
            });

            cuadrado.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Double procesof = Double.parseDouble(proceso.getText().toString());
                    Double respuesta = Math.pow(procesof,2);
                    String respuesta2 = String.valueOf(respuesta);
                    proceso.setText(respuesta2);
                }
            });

            raiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Double procesof = Double.parseDouble(proceso.getText().toString());
                    Double respuesta = Math.sqrt(procesof);
                    String respuesta2 = String.valueOf(respuesta);
                    proceso.setText(respuesta2);
                }
            });

            borrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    proceso.setText("");
                    resultado.setText("");
                }
            });

            borraruno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String delete = proceso.getText().toString();
                    if (delete.length()>=1){
                        delete=delete.substring(0,delete.length()-1);
                        proceso.setText(delete);
                    }
                    else if (delete.length()<1){
                        proceso.setText("");
                    }
                }
            });

            igual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String procesof = proceso.getText().toString();
                    procesof = procesof.replaceAll("x","*");
                    procesof = procesof.replaceAll("%","/100");
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("js");
//                String fina = String.valueOf(Double.parseDouble(procesof));
//                resultado.setText(fina);
                    try {
                        resultado.setText(engine.eval(procesof).toString());
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }
            });

        }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
