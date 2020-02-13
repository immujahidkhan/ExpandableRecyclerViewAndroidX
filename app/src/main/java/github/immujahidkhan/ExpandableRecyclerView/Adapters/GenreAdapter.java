package github.immujahidkhan.ExpandableRecyclerView.Adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import github.immujahidkhan.ExpandableRecyclerView.Models.Artist;
import github.immujahidkhan.ExpandableRecyclerView.Models.Genre;
import github.immujahidkhan.ExpandableRecyclerView.R;
import github.immujahidkhan.ExpandableRecyclerView.ViewHolders.ArtistViewHolder;
import github.immujahidkhan.ExpandableRecyclerView.ViewHolders.GenreViewHolder;
import github.immujahidkhan.expandablerecyclerviewandroidx.Adapters.ExpandableRecyclerViewAdapter;
import github.immujahidkhan.expandablerecyclerviewandroidx.Models.ExpandableGroup;

public class GenreAdapter extends ExpandableRecyclerViewAdapter<GenreViewHolder, ArtistViewHolder> {

    public GenreAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_genre, parent, false);
        return new GenreViewHolder(view);
    }

    @Override
    public ArtistViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_artist, parent, false);
        return new ArtistViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ArtistViewHolder holder, int flatPosition,
                                      ExpandableGroup group, int childIndex) {

        final Artist artist = ((Genre) group).getItems().get(childIndex);
        holder.setArtistName(artist.getName());
    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition,
                                      ExpandableGroup group) {

        holder.setGenreTitle(group);
    }
}
