package vikash.kumar.eternitylearning.fragments.extras;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import vikash.kumar.eternitylearning.BuildConfig;
import vikash.kumar.eternitylearning.R;


public class ExtrasFragment extends Fragment {

    private TextView about_us,share,rate,policy,contact_us,other_apps,exit;

    public ExtrasFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ExtrasFragment newInstance() {
        ExtrasFragment fragment = new ExtrasFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_extras, container, false);
        about_us=view.findViewById(R.id.about_us);
        share=view.findViewById(R.id.share);
        rate=view.findViewById(R.id.rate);
        policy=view.findViewById(R.id.policy);
        contact_us=view.findViewById(R.id.contact_us);
        other_apps=view.findViewById(R.id.other_apps);
        exit=view.findViewById(R.id.exit);

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message="\nWe are at introductory stage alluded as"+"<b> Tech Eternity Hub</b>"+" as of now creating Android Application which can be utilized in our everyday life. The technology you need and the consideration you deserve.We are endeavoring to changing the world with changing the technology by upgrading the product for transforming us.\n";
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                    alertDialogBuilder.setTitle("ABOUT US");
                    alertDialogBuilder
                        .setMessage(Html.fromHtml(message))
                            .setIcon(R.drawable.aboutus)
                        .setCancelable(true)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message="Learning is endless process.It would be ideal if you pause for a minute to share to others since sharing is Caring." +
                        "Our Motive is, If you are not moving you are dead. If you are not learning you are not moving." +
                        "If you are not making an effort to be a better human being or be better in skills of handling your life." +
                        "you are actually not learning or else not applying your learning" +
                        "A debt of gratitude is in order for your Cooperation.Keep Learning."+new String(Character.toChars(0x1F60A))+"\n\n";
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setTitle("SHARE");
                alertDialogBuilder
                        .setMessage(Html.fromHtml(message))
                        .setIcon(R.drawable.share)
                        .setCancelable(true)
                        .setPositiveButton("Share",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        try {
                                            Intent shareIntent = new Intent(Intent.ACTION_SEND);
                                            shareIntent.setType("text/plain");
                                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Eternity Learning");
                                            String shareMessage= "\nEternity Learning:-\n\n"+"Give us a chance to begin gaining popularity in an increasingly powerful manner. It is an unquestionable requirement to continue learning in life to continue upgrading your living background each minute. It would be ideal if you pause for a minute to Download,Rate and Share.\n\n";
                                            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n";
                                            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage+"\nThanks for your kind help !!"+new String(Character.toChars(0x1F60A)));
                                            startActivity(Intent.createChooser(shareIntent, "Choose One"));
                                        } catch(Exception e) {
                                            //e.toString();
                                        }
                                    }
                                })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message="\nAren't You enjoying ? On the off chance that Yes, demonstrate your adoration by sharing and rating our application.Keep Learning"+new String(Character.toChars(0x1F60A));
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setTitle("RATE");
                alertDialogBuilder
                        .setMessage(Html.fromHtml(message))
                        .setIcon(R.drawable.rate)
                        .setCancelable(true)
                        .setPositiveButton("RATE",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Uri uri = Uri.parse("market://details?id=" + BuildConfig.APPLICATION_ID);
                                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                                        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |Intent.FLAG_ACTIVITY_NEW_DOCUMENT |Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                                        try {
                                            startActivity(goToMarket);
                                        } catch (ActivityNotFoundException e) {
                                            startActivity(new Intent(Intent.ACTION_VIEW,
                                                    Uri.parse("http://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID )));
                                        }
                                    }
                                })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message="We are utilizing contents from different sites, for example, tutorialspoint, javatpoint, w3scholls and so forth for training reason as it were. We regard every law and We dont need to hurt anybody's policies or voilates any site strategy yet on the off chance that you discovered a portion of our contents which is unseemly,Please do reach to us through our Contact Us segment.";
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setTitle("POLICY");
                alertDialogBuilder
                        .setMessage(Html.fromHtml(message))
                        .setIcon(R.drawable.policy)
                        .setCancelable(true)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView message = new TextView(getContext());
                message.setText(
                        Html.fromHtml(
                                "<br>Something's Up ? Reach to us by underneath methods." +
                                        "<br><br><a href=\"http://smilingsingingsuccess.com/techeternityhub\">Check Our Website</a> " +
                                        "<br><br><a href=\"http://www.facebook.com/techeternityhub\">Facebook</a> " +
                                        "<br><br><a href=\"http://www.instagram.com/techeternity_hub\">Instagram</a> " +
                                        "<br><br><a href=\"mailto:techeternityhub@gmail.com\">Email</a> "));
                message.setMovementMethod(LinkMovementMethod.getInstance());
                message.setPadding(70,10,10,10);
                message.setTextColor(Color.parseColor("#000000"));
                message.setTextSize(16);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setTitle("CONTACT US");
                alertDialogBuilder
                        .setView(message)
                        .setIcon(R.drawable.contactus)
                        .setCancelable(true)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        other_apps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView message = new TextView(getContext());
                message.setText(
                        Html.fromHtml(
                                "<br>Check out our other apps on Google Play which might be useful for you." +
                                        "<br><br><a href=\"https://play.google.com/store/apps/details?id=vikash.kumar.instashareprint\">Insta Share & Print</a> " +
                                        "<br><br><a href=\"https://play.google.com/store/apps/details?id=vikash.kumar.smilingsingingsuccess\">Smiling Singing Success</a> "));
                message.setMovementMethod(LinkMovementMethod.getInstance());
                message.setPadding(70,10,10,10);
                message.setTextColor(Color.parseColor("#000000"));
                message.setTextSize(16);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setTitle("OTHER APPS");
                alertDialogBuilder
                        .setView(message)
                        .setIcon(R.drawable.otherapps)
                        .setCancelable(true)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setTitle("EXIT");
                alertDialogBuilder
                        .setMessage("Confirm To Exit From Application ?")
                        .setIcon(R.drawable.exit)
                        .setCancelable(true)
                        .setPositiveButton("EXIT",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        getActivity().finish();
                                        Intent intent = new Intent(Intent.ACTION_MAIN);
                                        intent.addCategory(Intent.CATEGORY_HOME);
                                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);
                                    }
                                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });



        return  view;
    }
   /* public static AlertDialog create(Context context) {
        final TextView message = new TextView(context);
        // i.e.: R.string.dialog_message => // "Test this dialog following the link to dtmilano.blogspot.com"
        final SpannableString s = new SpannableString(context.getText(R.string.dialog_message));
        Linkify.addLinks(s, Linkify.WEB_URLS);
        message.setText(s);
        message.setMovementMethod(LinkMovementMethod.getInstance());
        return new AlertDialog.Builder(context)
                .setTitle(R.string.dialog_title)
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setPositiveButton(R.string.dialog_action_dismiss, null)
                .setView(message)
                .create();
    }*/

}
