package fr.strada.smobile.utils.cardlib.models
import com.google.gson.annotations.SerializedName

data class SpecificConditions (

	@SerializedName("specificConditionRecords") val specificConditionRecords : List<SpecificConditionRecords>
)