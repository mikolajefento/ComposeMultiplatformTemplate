package common.network

sealed class ResponseResource<T> {
    data class Success<T>(val data: T) : ResponseResource<T>()
    data class Error<T>(val error: Throwable) : ResponseResource<T>()

    companion object {
        fun <T> success(data: T) = Success(data)
        fun <T> error(error: Throwable) = Error<T>(error)
    }
}