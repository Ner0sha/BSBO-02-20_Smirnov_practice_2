package ru.mirea.smirnov.dialog;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class myDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Привет МИРЭА!")
                .setMessage("Когда спать?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Иду на пары", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity)getActivity()).onOkClicked();
                        dialog.cancel();
                    }
                })
                .setNeutralButton("Спу", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ((MainActivity)getActivity()).onNeutralClicked();
                                dialog.cancel();
                            }
                        })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ((MainActivity)getActivity()).onCancelClicked();
                                dialog.cancel();
                            }
                        });
        return builder.create();
    }
}
