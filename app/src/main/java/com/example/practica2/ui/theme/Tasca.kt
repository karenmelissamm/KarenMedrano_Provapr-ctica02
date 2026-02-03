data class Tasca(
    val id: Int,
    val nom: String,
    val categoria: Categoria,
    val data: String,
    val estat: Estat
)
sealed class Categoria(val nom: String) {
    object Feina : Categoria("Feina")
    object Familia : Categoria("Família")
    object Personal : Categoria("Personal")
}

sealed class Estat(val nom: String) {
    object NoComencada : Estat("No començada")
    object EnCurs : Estat("En curs")
    object Finalitzada : Estat("Finalitzada")
}