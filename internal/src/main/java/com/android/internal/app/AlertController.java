package com.android.internal.app;

import android.content.DialogInterface;
import android.database.MatrixCursor;
import android.widget.ListView;

public class AlertController {
    public static class AlertParams {
        public MatrixCursor mCursor;
        public DialogInterface.OnClickListener mOnClickListener;
        public String mLabelColumn;
        public boolean mIsSingleChoice;
        public String mPositiveButtonText;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public String mNegativeButtonText;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public String mTitle;
        public int mCheckedItem;
        public interface OnPrepareListViewListener {
            public void onPrepareListView(ListView listView);
        }
    }
}
