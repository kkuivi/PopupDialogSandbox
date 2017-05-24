package elikem.sandbox.com.popupdialogsandbox;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ekuivi on 5/24/17.
 */



public class PopupDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_popup, null);

        builder.setView(dialogView);


        TextView message = (TextView) dialogView.findViewById(R.id.dialog_popup_tv_message);
        ImageView icon = (ImageView) dialogView.findViewById(R.id.dialog_popup_img_icon);
        Bundle args = getArguments();
        if(args != null) {
            message.setText(args.getString("message"));
            icon.setImageResource(args.getInt("iconID"));
        }

        return builder.create();
    }

    public static PopupDialogFragment getNewPopupDialogFragment(String message, int iconID){
        PopupDialogFragment popupDialogFragment = new PopupDialogFragment();
        Bundle args = new Bundle();
        args.putString("message", message);
        args.putInt("iconID", iconID);

        popupDialogFragment.setArguments(args);
        return popupDialogFragment;

    }

}
