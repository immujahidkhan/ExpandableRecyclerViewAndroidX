package github.immujahidkhan.expandablerecyclerviewandroidx.ViewHolders;


import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import github.immujahidkhan.expandablerecyclerviewandroidx.Listeners.OnGroupClickListener;
import github.immujahidkhan.expandablerecyclerviewandroidx.Models.ExpandableGroup;

/**
 * ViewHolder for the {@link ExpandableGroup} in a {@link ExpandableGroup}
 *
 * The current implementation does now allow for sub {@link View} of the parent view to trigger
 * a collapse / expand. *Only* click events on the parent {@link View} will trigger a collapse or
 * expand
 */
public abstract class GroupViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private OnGroupClickListener listener;

    public GroupViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onGroupClick(getAdapterPosition());
        }
    }

    public void setOnGroupClickListener(OnGroupClickListener listener) {
        this.listener = listener;
    }

    public void expand() {}

    public void collapse() {}
}