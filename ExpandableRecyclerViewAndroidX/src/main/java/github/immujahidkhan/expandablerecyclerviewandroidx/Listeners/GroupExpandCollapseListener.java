package github.immujahidkhan.expandablerecyclerviewandroidx.Listeners;

import github.immujahidkhan.expandablerecyclerviewandroidx.Models.ExpandableGroup;

public interface GroupExpandCollapseListener {
    void onGroupExpanded(ExpandableGroup group);

    void onGroupCollapsed(ExpandableGroup group);
}