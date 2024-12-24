import static org.moqui.util.ObjectUtilities.*
import static org.moqui.util.CollectionUtilities.*
import static org.moqui.util.StringUtilities.*
import java.sql.Timestamp
import java.sql.Time
import java.time.*
// these are in the context by default: ExecutionContext ec, Map<String, Object> context, Map<String, Object> result

// begin inline script
if (true) {
    ec.service.sync().name("create#org.moqui.training.MoquiTraining")
            .parameters(context).call()
    if (ec.message.hasError()) return
}
return;
// end inline script
// make sure the last statement is not considered the return value
return;
