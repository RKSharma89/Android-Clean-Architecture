package com.androchef.remote.mappers.credits

import com.androchef.data.models.CrewEntity
import com.androchef.remote.mappers.EntityMapper
import com.androchef.remote.models.credits.CrewModel

class CrewResponseEntityMapper : EntityMapper<CrewModel, CrewEntity> {
    override fun mapFromModel(model: CrewModel): CrewEntity {
        return  CrewEntity(
            id = model.id,
            profile_path = model.profilePath,
            name = model.name
        )
    }
}