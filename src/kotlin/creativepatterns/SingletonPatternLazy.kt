//package kotlin.creativepatterns
//
///**
// * @author Armyone
// * @date 2019/2/13 17:20
// * @desc
// */
//class SingletonPatternLazy private constructor() {
//    companion object {
//        private var instance: SingletonPatternLazy? = null
//            get() {
//                if (field == null) {
//                    field = SingletonPatternLazy()
//                }
//                return field;
//            }
//
//        fun get(): SingletonPatternLazy {
//            return instance!!
//        }
//    }
//}