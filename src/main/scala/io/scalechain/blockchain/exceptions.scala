package io.scalechain.blockchain


object ErrorCode {
  val InvalidBlockMagic = ErrorCode("invalid_block_magic")
  val InvalidScriptOperation = ErrorCode("invalid_script_operation")
  val ScriptTypeMismatch = ErrorCode("script_type_mismatch")
  val DisabledScriptOperation = ErrorCode("disabled_script_operation")
  // We expect script numbers on stack are up to 4 bytes. In case hitting any number encoded in more than 4 bytes, raise this error.
  val TooBigScriptInteger = ErrorCode("too_big_script_integer")
  val InvalidTransaction = ErrorCode("invalid_transaction")
  val NotEnoughInput = ErrorCode("not_enough_input")
  val NotEnoughScriptData = ErrorCode("not_enough_script_data")

  // Parse errors
  val NoDataAfterCodeSparator = ErrorCode("no_data_after_code_separator")
  val UnexpectedEndOfScript = ErrorCode("unexpected_end_of_script")
}

case class ErrorCode(val code:String)

/**
 * Created by kangmo on 11/2/15.
 */
class FatalException(val code:ErrorCode) extends Exception {
}

class ScriptEvalException(val code:ErrorCode) extends Exception {
}

class ScriptParseException(val code:ErrorCode) extends Exception {

}