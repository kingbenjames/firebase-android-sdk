// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Autogenerated, do not edit
public class RemoteMessageCreator implements Creator<RemoteMessage> {
  public static final int CONTENT_DESCRIPTION = 0;

  public RemoteMessageCreator() {}

  @Nullable
  public RemoteMessage createFromParcel(final Parcel parcel) {
    int end = SafeParcelReader.validateObjectHeader(parcel);
    Bundle _local_safe_0a1b_bundle = null;

    while (parcel.dataPosition() < end) {
      int header = SafeParcelReader.readHeader(parcel);
      switch (SafeParcelReader.getFieldId(header)) {
        case 2:
          _local_safe_0a1b_bundle = SafeParcelReader.createBundle(parcel, header);
          break;
        default:
          SafeParcelReader.skipUnknownField(parcel, header);
      }
    }

    SafeParcelReader.ensureAtEnd(parcel, end);
    RemoteMessage obj = new RemoteMessage(_local_safe_0a1b_bundle);
    return obj;
  }

  @Nullable
  public RemoteMessage[] newArray(int size) {
    return new RemoteMessage[size];
  }

  static void writeToParcel(RemoteMessage obj, Parcel parcel, int flags) {
    int myStart = SafeParcelWriter.beginObjectHeader(parcel);
    SafeParcelWriter.writeBundle(parcel, 2, obj.bundle, false);
    SafeParcelWriter.finishObjectHeader(parcel, myStart);
  }
}
