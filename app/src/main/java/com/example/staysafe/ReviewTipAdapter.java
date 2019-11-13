package com.example.staysafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReviewTipAdapter extends RecyclerView.Adapter<ReviewTipAdapter.ReviewTipVH> {
    private ArrayList<String> list;

    ReviewTipAdapter(ArrayList<String> reviewList) {
        list = reviewList;
    }

    @NonNull
    @Override
    public ReviewTipAdapter.ReviewTipVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_tip_content, parent, false);
        return new ReviewTipVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewTipAdapter.ReviewTipVH holder, int position) {
        holder.reviewTip.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ReviewTipVH extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView reviewTip;
        public Button approve;
        public Button decline;

        public ReviewTipVH(@NonNull View itemView) {
            super(itemView);
            reviewTip = (TextView) itemView.findViewById(R.id.review_tip);
            approve = (Button) itemView.findViewById(R.id.approve);
            decline = (Button) itemView.findViewById(R.id.decline);
            setListener();
        }

        private void setListener() {
            approve.setOnClickListener(this);
            decline.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            String text = "";
            switch (view.getId()) {
                case R.id.approve:
                    text = "Suggestion Approved";
                    break;
                case R.id.decline:
                    text = "Suggection Declined";
            }
            Toast.makeText(itemView.getContext(), text, Toast.LENGTH_LONG).show();
        }
    }
}
