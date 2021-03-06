// Generated by view binder compiler. Do not edit!
package pranata.voga.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pranata.voga.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnHitung;

  @NonNull
  public final EditText etTenor;

  @NonNull
  public final EditText etUang;

  @NonNull
  public final ImageView imgLogo;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView tvDanaCair;

  @NonNull
  public final TextView tvTotalBayar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnHitung,
      @NonNull EditText etTenor, @NonNull EditText etUang, @NonNull ImageView imgLogo,
      @NonNull TextView textView, @NonNull TextView textView10, @NonNull TextView textView11,
      @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView2,
      @NonNull TextView textView8, @NonNull TextView tvDanaCair, @NonNull TextView tvTotalBayar) {
    this.rootView = rootView;
    this.btnHitung = btnHitung;
    this.etTenor = etTenor;
    this.etUang = etUang;
    this.imgLogo = imgLogo;
    this.textView = textView;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView2 = textView2;
    this.textView8 = textView8;
    this.tvDanaCair = tvDanaCair;
    this.tvTotalBayar = tvTotalBayar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_hitung;
      Button btnHitung = ViewBindings.findChildViewById(rootView, id);
      if (btnHitung == null) {
        break missingId;
      }

      id = R.id.et_tenor;
      EditText etTenor = ViewBindings.findChildViewById(rootView, id);
      if (etTenor == null) {
        break missingId;
      }

      id = R.id.et_uang;
      EditText etUang = ViewBindings.findChildViewById(rootView, id);
      if (etUang == null) {
        break missingId;
      }

      id = R.id.img_logo;
      ImageView imgLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgLogo == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.tv_dana_cair;
      TextView tvDanaCair = ViewBindings.findChildViewById(rootView, id);
      if (tvDanaCair == null) {
        break missingId;
      }

      id = R.id.tv_total_bayar;
      TextView tvTotalBayar = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalBayar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnHitung, etTenor, etUang,
          imgLogo, textView, textView10, textView11, textView13, textView14, textView2, textView8,
          tvDanaCair, tvTotalBayar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
