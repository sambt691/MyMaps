package edu.stanford.smensah.mymaps.models

import edu.stanford.smensah.mymaps.Place.Place
import java.io.Serializable

data class UserMap(val title: String, val places: List<Place>) : Serializable