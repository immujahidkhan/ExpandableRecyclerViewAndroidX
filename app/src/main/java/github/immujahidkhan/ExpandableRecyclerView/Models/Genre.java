package github.immujahidkhan.ExpandableRecyclerView.Models;


import java.util.List;

import github.immujahidkhan.expandablerecyclerviewandroidx.Models.ExpandableGroup;

public class Genre extends ExpandableGroup<Artist> {

    private int iconResId;

    public Genre(String title, List<Artist> items, int iconResId) {
        super(title, items);
        this.iconResId = iconResId;
    }

    public int getIconResId() {
        return iconResId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genre)) return false;

        Genre genre = (Genre) o;

        return getIconResId() == genre.getIconResId();

    }

    @Override
    public int hashCode() {
        return getIconResId();
    }
}
