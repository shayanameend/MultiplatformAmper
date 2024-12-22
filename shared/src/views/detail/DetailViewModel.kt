package views.detail

import androidx.lifecycle.ViewModel
import data.MuseumObject
import data.MuseumRepository
import kotlinx.coroutines.flow.Flow

class DetailViewModel(private val museumRepository: MuseumRepository) : ViewModel() {
  fun getObject(objectId: Int): Flow<MuseumObject?> =
    museumRepository.getObjectById(objectId)
}